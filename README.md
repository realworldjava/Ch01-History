# Chapter 1: How We Got Here: History of Java in a Nutshell

This repository contains the code from the book for Chapter 1, How We Got Here: History of Java in a Nutshell. See the [main book page](https://github.com/realworldjava) for the list of all chapter specific repositories.

# How this repository is organized

In this repository, all code is in the main branch. There are two folders: 
| Folder Name  | Contents |
| ------------- | ------------- |
| java-syntax-examples  | All the examples except modules  |
| book-module  | the module example |

# How to run the examples in this chapter

Since the book has not yet covered git, build tools, we don't assume you are familar with how to clone a repository yet. You have a few alteratives:

1. Look at the code in a browser by clicking through the folder hierarchy
1. [Downloading the repository as a zip file](https://github.com/realworldjava/Ch01-History/archive/refs/heads/main.zip)
1. If you already know Git and have it installed, you can run:

```
https://github.com/realworldjava/Ch01-History.git
````

 For the java-syntax-examples folder, you can copy/paste it into your IDE on your machine or the [Java playground](https://dev.java/playground/) in your browser.

For book-module folder, you can compile by downloading the code and unzipping it. Then cd into the Ch00-Intro/book-module directory and run

```
javac --module-path mods -d src src/*.java src/com/wiley/realworldjava/modulecode/internal/*.java src/com/wiley/realworldjava/modulecode/utils/*.java
```

There is no main method so you cannot run the code in this folder; only compile it.

# Clickable Links from the Further References Section

* [Oracle’s guide to text blocks](https://docs.oracle.com/en/java/javase/15/text-blocks/index.html)
* [Oracle's guide to records](https://docs.oracle.com/en/java/javase/14/language/records.htm)

