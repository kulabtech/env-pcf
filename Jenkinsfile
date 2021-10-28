pipeline {
 agent any
 tools{
     maven 'M2_HOME'
      }
     stages{
         stage('CheckoutCode')
          {
            steps
             {
                git credentialsId: 'GIT_CREDS', url: 'https://github.com/shaanu1998/allstates_demo.git' , branch: 'backend'
             }
          }
         stage ('Build') 
         {
            steps 
            {
                sh 'mvn clean package'
            }
        }
    }
}
