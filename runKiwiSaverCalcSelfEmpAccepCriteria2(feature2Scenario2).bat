echo "starting script"
cd /WestPacInterview/interview
mvn clean test -Dcucumber.options="--tags @Self-Employed"
echo "ending script"