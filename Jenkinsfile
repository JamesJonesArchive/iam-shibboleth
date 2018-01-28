node('master') {
  env.JAVA_HOME = tool 'jdk8'
  env.GRADLE_HOME = tool 'gradle4.2'
  env.GRAILS_HOME = tool 'grails3.2.8'
  env.ANSIBLE_HOME = tool 'ansible2.2.0'
  env.ANT_HOME = tool 'ant1.10'
  def mvnHome = tool 'maven3'

  env.PATH = "${env.JENKINS_HOME}/bin:${mvnHome}/bin:${env.GRADLE_HOME}/bin:${env.GRAILS_HOME}/bin:${env.PATH}"
  checkout scm

  stage('Clone java-identity-provider') {
    sh('#!/bin/sh -e\n' + "chmod 755 gradlew")
    dir('java-identity-provider') {
      git url: 'git://git.shibboleth.net/java-identity-provider.git', branch: 'master'
      sh ' ./bin/install.sh'
    } 
  }
}
