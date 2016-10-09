
node {
	git url: 'https://github.com/flugel-it/fun-with-jenkins2.git'
}

stage "Build"
node {
	sh "scripts/deploy.sh"
}

stage "Test"
node {
	sh "scripts/test.sh"
}

stage "Deploy"
node {
	sh "scripts/deploy.sh"
}

