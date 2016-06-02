#!/usr/bin/env bash
mkdir /letv/
mkdir /letv/logs
mkdir /letv/logs/nginx
mkdir /letv/softs
mkdir /letv/bak
mkdir /letv/softs/jdk1.7.0_76
echo 'export JAVA_HOME=/letv/softs/jdk1.7.0_76
export PATH=$JAVA_HOME/bin:$PATH
MAVEN_HOME=/letv/softs/apache-maven-3.3.9/
export MAVEN_HOME
export PATH=${PATH}:${MAVEN_HOME}/bin
export PATH=/usr/local/git/bin:$PATH' >> /etc/profile
source /etc/profile
cp /letv/softs/apache-maven-3.3.9 /letv/tomcat-lepay
cd /letv/softs/nginx-1.8.0
./config  --with-http_ssl_module
ln -s /usr/local/nginx/sbin/nginx  /etc/rc.d/init.d/nginx
ln -s /usr/local/nginx/sbin/nginx  /usr/local/bin/nginx
ln -s /data/lepay-api /letv/tomcat-lepay/webapps/ROOT


rsync -avz -e ssh /letv/softs/ root@10.120.1.166:/letv/softs/