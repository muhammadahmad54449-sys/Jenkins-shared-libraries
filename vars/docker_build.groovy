def call (String ProjectName , String ImageTag , String dockerhubuser) {
  sh "docker build -t ${dockerhubuser}/${ProjectName}:${ImageTag} ."
}
