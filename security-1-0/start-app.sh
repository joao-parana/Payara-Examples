set -e

set -x

java -jar $HOME/bin/payara-micro-5.194.jar \
    --deploy target/jsec.war > jsec.log 2> jsec.err &
sleep 15
ps -ef | grep jsec.war
wc jsec.log
tail -n 500 -f jsec.err

