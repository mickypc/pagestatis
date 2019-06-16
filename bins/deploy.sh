environment=$1
if [ "$environment" = "" ];then
  echo "usage:$0 <environment>"
else
  cp -a conf/${environment}/. src/main/resources/
  mvn package
fi
