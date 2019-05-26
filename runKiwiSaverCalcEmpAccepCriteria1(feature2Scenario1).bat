echo "starting script"
cd /WestPacInterview/interview
mvn clean test -Dcucumber.options="--tags @Employed"
echo "ending script"