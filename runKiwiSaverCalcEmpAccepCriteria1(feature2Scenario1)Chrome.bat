echo "starting script"
cd /WestPacInterview/interview
mvn clean test -DdriverName=Chrome -Dcucumber.options="--tags @Employed"
echo "ending script"