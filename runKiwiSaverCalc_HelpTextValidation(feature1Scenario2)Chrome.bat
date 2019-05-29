echo "starting script"
cd /WestPacInterview/interview
mvn clean test -DdriverName=Chrome -Dcucumber.options="--tags @HelpTextValidation"
echo "ending script"