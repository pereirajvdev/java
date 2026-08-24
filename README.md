PereiraPvP Mod

A collection of client-side Minecraft mods and utilities developed with Fabric.

This repository contains different features and experiments developed for Minecraft, organized into independent modules and utilities.

Features
Client-side utilities
Custom commands
FreeCam functionality
TipTapShow
Custom keybindings
Other PvP and quality-of-life features
Technologies
Java
Minecraft
Fabric
Fabric API
Project Structure

The project is organized into separate classes and modules, with the main client initialization handled by ModMain.

src/
└── main/
    └── java/
        └── com/
            └── pereirapvp/
                └── pvp/
                    ├── ModMain.java
                    ├── ModCommands.java
                    ├── FreeCam.java
                    └── ...
Installation
Install Fabric Loader for the Minecraft version supported by the project.
Install the required Fabric API version.
Download/build the mod .jar.
Place the .jar file in your Minecraft mods folder.
Launch Minecraft using the Fabric profile.
Development

Clone the repository and open it in your preferred Java IDE.

git clone <repository-url>

Build the project using Gradle:

./gradlew build

The compiled .jar files will be generated in:

build/libs/
License

This project is provided for personal and educational purposes.
