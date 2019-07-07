#!/bin/bash
version=$1
if [ "$version" != "" ]
then
	basedir=$(cd "$(dirname "$0")";pwd)
	pid=`ps -ef | grep pagestatis-${version}.jar | grep -v 'grep' | awk '{print $2}'`
	if [ "$pid" != "" ]
	then
	  echo "shutdown pagestatis:$pid"
	  kill $pid
	fi
else
	echo "usage: $0 <version>"
fi
