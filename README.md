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


```scala

object sample {
  def main(args: Array[String]): Unit = {
    println("Welcome to my scala program!")
  }
}

```
Now, let's compile the project using sbt. Type sbt in the terminal and wait until
sbt interactive shell appears.

Then use `compile` command to compile the project, alternatively use can use
`~compile` to recompile on code change automatically.

```bash
sbt:scala-practice> compile
[success] Total time: 0 s, completed Dec 8, 2020, 12:14:42 AM
sbt:scala-practice>
```

After compilation is complete, run the project using `run` command.

```bash
[info] running FooBuild
Welcome to my scala program!
[success] Total time: 0 s, completed Dec 8, 2020, 12:15:35 AM
sbt:scala-practice>
```

## Converting scala files to jar

Use the `package` command in `sbt` to convert the scala project to a jar file.
You will be able to see below message after successful conversion.

```shell
sbt:scala-practice> package
[success] Total time: 0 s, completed Dec 20, 2020, 2:18:54 PM
```

The **scala** jar file called `target/scala-X.XX/project-name_X.XX-X.X.X-SNAPSHOT.jar` is created and can be run using scala command.

```shell
john@linux:~/projects/scala/scala-practice$ scala target/scala-2.12/scala-practice_2.12-0.1.0-SNAPSHOT.jar 
This is a message.
another neeeeeeeeeew message!!
```

## Using packages

Use packages to keep your codes organized.

Inside 'src/main/scala/' create another folder called `utils`.
And within that folder create a file called `Messenger.scala` with the following
content.

```scala
package utils

object Messenger {

    def Greet() : Unit = {
        println("This is a message.")
    }
}

```

And then in the `sample.scala` file, update the code...


```scala
import utils.Messenger.Greet

// You can name the object same as project name or app name
object sample {
  def main(args: Array[String]): Unit = {
    // println("Welcome to my scala program!")
    Greet()
  }
}

```
Compile again and then run...

```
sbt:scala-practice> compile
[success] Total time: 0 s, completed Dec 8, 2020, 12:29:42 AM
sbt:scala-practice> run
[info] running sample
This is a message.
[success] Total time: 0 s, completed Dec 8, 2020, 12:29:44 AM
sbt:scala-practice>

```
