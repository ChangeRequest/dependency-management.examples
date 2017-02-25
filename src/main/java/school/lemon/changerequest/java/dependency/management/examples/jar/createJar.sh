#!/usr/bin/env bash

javac FirstClass.java SecondClass.java
jar -cf firstJar.jar FirstClass.class SecondClass.class