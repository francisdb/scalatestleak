# scalatestleak
https://github.com/scalatest/scalatest/issues/1960

## How to reproduce

* Start a sbt session
* Start visualvm and connect to the sbt jvm
* Use visualvm and monitor loaded classes / metaspace / threads (see screenshots below)
* Run `test`
* Force gc using the button in visualvm
* Run `test`
* Force gc using the button in visualvm
* repeat...

You should see something like this:
![img.png](img.png)

This is with the akka based eventually (no leak):
![img_1.png](img_1.png)