package sample

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.fxml.FXMLLoader.load
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.FileChooser
import javafx.stage.Stage

/**
 * Created by cleanci on 2017/4/3.
 */

class Sello : Application() {
    override fun start(primaryStage: Stage?) {
        val root = FXMLLoader.load<Parent>(Sello::class.java.getResource("sample.fxml"))
        val scene = Scene(root, 400.0, 600.0)
        primaryStage?.scene = scene
        primaryStage?.title = "Sello"
        primaryStage?.show()

        fun choseFile() {
            val fileChose = FileChooser()
            fileChose.title = "选择文件"
            fileChose.showOpenDialog(primaryStage)
        }
    }

    fun startSello() = launch(Sello::class.java)
}

