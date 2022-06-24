#!/bin/bash

rmiregistry &

javac --module-path "./openjfx-18.0.1_linux-aarch64_bin-sdk/javafx-sdk-18.0.1/lib" --add-modules javafx.controls,javafx.fxml ChatClient.java ChatClientIF.java ChatServer.java ChatServerDriver.java ChatServerIF.java Main.java Scene2Controller.java SceneController.java

java ChatServerDriver;

pkill rmiregistry;