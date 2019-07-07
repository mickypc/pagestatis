#!/bin/bash
version=$1
if [ "$version" != "" ]
then
	basedir=$(cd "$(dirname "$0")";pwd)
	nohup java -jar -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=128m -Xms1024m -Xmx1024m -Xmn256m -Xss256k -XX:SurvivorRatio=8 -XX:+UseConcMarkSweepGC ${basedir}/pagestatis-${version}.jar >> ${basedir}/nohup.out 2>&1 &
else
	echo "usage: $0 <version>"
fi