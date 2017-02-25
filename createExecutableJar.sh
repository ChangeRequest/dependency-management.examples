#!/usr/bin/env bash
javac -d build/classes src/main/java/school/lemon/changerequest/java/dependency/management/examples/executableJar/HelloWorld.java

jar cfm build/executableJar.jar src/main/java/school/lemon/changerequest/java/dependency/management/examples/executableJar/manifestExample.mf -C build/classes school/lemon/changerequest/java/dependency/management/examples/executableJar/HelloWorld.class