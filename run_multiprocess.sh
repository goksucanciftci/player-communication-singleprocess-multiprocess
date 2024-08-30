#!/bin/bash
cd "$(dirname "$0")/player-task"

mvn clean install

java -cp target/classes com.playercommunication.multiprocess.Main
