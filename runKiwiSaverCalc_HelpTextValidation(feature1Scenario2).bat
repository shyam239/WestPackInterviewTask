echo "starting script"
cd /WestPacInterview/interview
mvn clean test -Dcucumber.options="--tags @HelpTextValidation"
echo "ending script"