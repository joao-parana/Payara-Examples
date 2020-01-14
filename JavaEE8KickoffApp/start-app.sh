set -e

set -x

java -jar $HOME/bin/payara-micro-5.194.jar \
    --deploy target/kickoff.war  > kickoff.log 2>&1 &
sleep 15
ps -ef | grep kickoff.war
wc kickoff.log
tail -n 500 -f kickoff.log

