#!/bin/bash
version=$1
pid=`ps -ef | grep pagestatis-${version}.jar | grep -v 'grep' | awk '{print $2}'`
if [ "$pid" != "" ]
then
  echo "shutdown pagestatis:$pid"
  kill $pid
fi
