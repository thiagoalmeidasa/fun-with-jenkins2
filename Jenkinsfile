
node {
	git url: 'https://github.com/flugel-it/fun-with-jenkins2.git'
	stage "Build"
	sh "scripts/deploy.sh"
	stage "Test"
	sh "scripts/test.sh"
	stage "Deploy"
	sh "scripts/deploy.sh"
}

