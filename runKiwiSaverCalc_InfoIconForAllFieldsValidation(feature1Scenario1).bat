echo "starting script"
cd /WestPacInterview/interview
mvn clean test -Dcucumber.options="--tags @IconPresentValidation"
echo "ending script"