echo "starting script"
cd /WestPacInterview/interview
mvn clean test -Dcucumber.options="--tags @Not-Employed"
echo "ending script"