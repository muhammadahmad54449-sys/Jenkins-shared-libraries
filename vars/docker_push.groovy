def call (String ProjectName , String ImageTag , String dockerhubuser) {
  sh "docker push ${dockerhubuser}/${ProjectName}:${ImageTag}"
}
