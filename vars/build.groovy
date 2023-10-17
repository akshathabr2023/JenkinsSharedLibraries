def call(String mavenGoal){
  
  if ("${mavenGoal}" == "Clean")
     {
       sh "mvn clean"
     }
  else if ("${mavenGoal}" == "Compile")
     {
       sh "mvn clean compile"
     }
  else if ("${mavenGoal}" == "Test")
     {
       bat "mvn clean test"
     }
   else if ("${mavenGoal}" == "Package")
      {
        bat "mvn clean package"
     }
}
