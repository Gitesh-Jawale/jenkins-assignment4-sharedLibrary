def call (String url, String branch) {
    echo "hi sagar"
    git branch: "${branch}" , url: "${url}"
    echo "${url}"
    echo "Gitesh"
    
}
