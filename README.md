# Note-Taking Application

This is a simple console-based Note-Taking Application developed in Java.

## Description

This application allows you to add, edit, delete and view notes. The notes are stored in a text file named `notes.txt`
in the same directory as the application. The application reads the notes from the text file and stores them in
an `ArrayList` of `String` objects. The `ArrayList` is used to perform the operations on the notes. The `ArrayList` is
then written back to the text file after the operations are performed.

## Table of Contents

- [Note-Taking Application](#note-taking-application)
    - [Description](#description)
    - [Table of Contents](#table-of-contents)
    - [Features](#features)
    - [How to Run](#how-to-run)
    - [Usage](#usage)
    - [Requirements](#requirements)
    - [Contributing](#contributing)
    - [License](#license)

## Features

- Add a Note
- Edit a Note
- Delete a Note
- View all Notes
- Exit the Application

## How to Run

1. Compile the `NoteTakingApp.java` file.
2. Run the compiled `NoteTakingApp.class` file.

## Usage

The application presents a menu with the following options:

1. Add Note: Allows you to add a new note.
2. Edit Note: Allows you to edit an existing note. You will need to provide the index of the note you want to edit.
3. Delete Note: Allows you to delete an existing note. You will need to provide the index of the note you want to
   delete.
4. View Notes: Displays all the notes you have added.
5. Exit: Exit the application.

## Requirements

- Java Development Kit (JDK)

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the [MIT License](https://choosealicense.com/licenses/mit/).