# scala-practice
my first scala project

I made this repo to practice scala. I found this useful [link](https://www.scala-sbt.org/1.x/docs/sbt-by-example.html) for
setting up a scala project using **sbt**.

## Prerequisites

You'll need the following...

* scala
* sbt
* IDE

## Project setup

First create the project directory, let's call it `scala-practice`. Then `cd`
into the project directory.

```
cd scala-practice
```

Let's create the build file, using wsl bash or directly in the file manager.

```
touch build.sbt
```

Then let's create the source folder for the scala codes...`src/main/scala/`.
Inside the scala folder, let's put our sample code called `sample.scala`.

```bash
[23:56:48] john@DESKTOP-39NECQE:.../projects/scala/scala-practice
$tree
.
├── build.sbt
├── LICENSE
├── README.md
└── src
    └── main
        └── scala
            └── sample.scala

3 directories, 4 files
```
In the `sample.scala` file, type the following code.


````scala

object sample {
  def main(args: Array[String]): Unit = {
    println("Welcome to my scala program!")
  }
}
```
