pipeline {
 agent any
 tools{
     maven 'Maven'
      }
     stages{
         stage('CheckoutCode')
          {
            steps
             {
                git credentialsId: 'git_creds', url: 'https://github.com/kulabtech/env-pcf.git' , branch: 'master'
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
// test file added in test webhooks
