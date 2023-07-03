def call(String repositoryUrl, String branch = 'master') {
    git branch: '$branch', url: '$repositoryUrl'
}
