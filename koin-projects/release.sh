#!/bin/sh

./gradlew clean test dokka install publishToMavenLocal bintrayUpload --info --no-parallel