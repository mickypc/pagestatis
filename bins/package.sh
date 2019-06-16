version=0.0.1
pkgname=pagestatis

#rm -rf ${pkgname}
#rm ${pkgname}_${version}.zip
#mkdir ${pkgname}

cp target/${pkgname}-${version}.jar ${pkgname}/
cp bins/startup.sh bins/shutdown.sh ${pkgname}/
#cp -a data/certs ${pkgname}_${version}/data
zip -rq ${pkgname}_${version}.zip ${pkgname}/
cd ${pkgname}
./shutdown.sh ${version}
./startup.sh ${version}
