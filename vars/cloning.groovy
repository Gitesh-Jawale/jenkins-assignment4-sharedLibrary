def call(String repositoryUrl, String branch = 'master') {
    echo $repositoryUrl
    echo $branch
    git branch: '$branch', url: '$repositoryUrl'
}
