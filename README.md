# Renovate-kotlin
renovate reproduction for test

## Expected

`buildSrc/src/main/kotlin/Dependencies.kt`. 
`buildSrc/src/main/kotlin/Plugins.kt`. 

must be detected by renovate version check dependecy

## Happen

There are no scan result on the dependency dashboard.  
For example, spring-boot latest version is `2.5.6` but the repository is still `2.5.5`. 
and mockk latest version is `1.12.0` but the repository is still `1.11.0`. 

## Reproduction Progress

1. Generate the repository based by caused problem on the repository.
2. Self hosting with docker below this configuration.
```javascript
module.exports = {
	platform: 'github',
	token: 'my_token',
	logLevel: 'debug',
	repositories: ['huisam/Renovate-kotlin']
};
```
3. run self hosting


## Debug logs


<details>
<summary>debug log</summary>
  
<div markdown="1">

```text
DEBUG: Using RE2 as regex engine
DEBUG: Parsing configs
DEBUG: Checking for config file in /usr/src/app/config
DEBUG: File config
       "config": {
         "platform": "github",
         "token": "***********",
         "logLevel": "debug",
         "repositories": ["huisam/Renovate-kotlin"]
       }
DEBUG: CLI config
       "config": {}
DEBUG: Env config
       "config": {"hostRules": []}
DEBUG: Combined config
       "config": {
         "platform": "github",
         "token": "***********",
         "logLevel": "debug",
         "repositories": ["huisam/Renovate-kotlin"],
         "hostRules": []
       }
DEBUG: Using default github endpoint: https://api.github.com/
DEBUG: GitHub 404
       "url": "https://api.github.com/user/emails"
DEBUG: Cannot read user/emails endpoint on GitHub to retrieve gitAuthor
DEBUG: Authenticated as GitHub user: huisam
DEBUG: Adding token authentication for api.github.com to hostRules
DEBUG: Using baseDir: /tmp/renovate
DEBUG: Using cacheDir: /tmp/renovate/cache
DEBUG: Initializing Renovate internal cache into /tmp/renovate/cache/renovate/renovate-cache-v1
DEBUG: Commits limit = null
DEBUG: Clearing hostRules
DEBUG: Adding token authentication for api.github.com to hostRules
 INFO: Repository started (repository=huisam/Renovate-kotlin)
       "renovateVersion": "28.15.0"
DEBUG: Using localDir: /tmp/renovate/repos/github/huisam/Renovate-kotlin (repository=huisam/Renovate-kotlin)
DEBUG: initRepo("huisam/Renovate-kotlin") (repository=huisam/Renovate-kotlin)
DEBUG: Overriding default GitHub endpoint (repository=huisam/Renovate-kotlin)
       "endpoint": "https://api.github.com/"
DEBUG: huisam/Renovate-kotlin default branch = main (repository=huisam/Renovate-kotlin)
DEBUG: Using personal access token for git init (repository=huisam/Renovate-kotlin)
DEBUG: resetMemCache() (repository=huisam/Renovate-kotlin)
DEBUG: Resetting npmrc (repository=huisam/Renovate-kotlin)
DEBUG: detectSemanticCommits() (repository=huisam/Renovate-kotlin)
DEBUG: Initializing git repository into /tmp/renovate/repos/github/huisam/Renovate-kotlin (repository=huisam/Renovate-kotlin)
DEBUG: Performing blobless clone (repository=huisam/Renovate-kotlin)
DEBUG: git clone completed (repository=huisam/Renovate-kotlin)
       "durationMs": 1490
DEBUG: latest repository commit (repository=huisam/Renovate-kotlin)
       "latestCommit": {
         "hash": "632769a5309880c60a6b8baa7405ba8dc1a03854",
         "date": "2021-10-29T20:42:10+09:00",
         "message": "chore: add mockk dependency version",
         "refs": "HEAD -> main, origin/main, origin/HEAD",
         "body": "",
         "author_name": "huisam",
         "author_email": "huisam@naver.com"
       }
DEBUG: getCommitMessages (repository=huisam/Renovate-kotlin)
DEBUG: Semantic commits detection: angular (repository=huisam/Renovate-kotlin)
DEBUG: angular semantic commits detected (repository=huisam/Renovate-kotlin)
DEBUG: checkOnboarding() (repository=huisam/Renovate-kotlin)
DEBUG: isOnboarded() (repository=huisam/Renovate-kotlin)
DEBUG: findFile(renovate.json) (repository=huisam/Renovate-kotlin)
DEBUG: Config file exists (repository=huisam/Renovate-kotlin)
       "fileName": "renovate.json"
DEBUG: Retrieving issueList (repository=huisam/Renovate-kotlin)
DEBUG: Retrieved 1 issues (repository=huisam/Renovate-kotlin)
DEBUG: Repo is onboarded (repository=huisam/Renovate-kotlin)
DEBUG: Found renovate.json config file (repository=huisam/Renovate-kotlin)
DEBUG: Repository config (repository=huisam/Renovate-kotlin)
       "fileName": "renovate.json",
       "config": {
         "$schema": "https://docs.renovatebot.com/renovate-schema.json",
         "extends": ["config:base"]
       }
DEBUG: migrateAndValidate() (repository=huisam/Renovate-kotlin)
DEBUG: No config migration necessary (repository=huisam/Renovate-kotlin)
DEBUG: massaged config (repository=huisam/Renovate-kotlin)
       "config": {
         "$schema": "https://docs.renovatebot.com/renovate-schema.json",
         "extends": ["config:base"]
       }
DEBUG: migrated config (repository=huisam/Renovate-kotlin)
       "config": {
         "$schema": "https://docs.renovatebot.com/renovate-schema.json",
         "extends": ["config:base"]
       }
DEBUG: Setting hostRules from config (repository=huisam/Renovate-kotlin)
DEBUG: Found repo ignorePaths (repository=huisam/Renovate-kotlin)
       "ignorePaths": [
         "**/node_modules/**",
         "**/bower_components/**",
         "**/vendor/**",
         "**/examples/**",
         "**/__tests__/**",
         "**/test/**",
         "**/tests/**",
         "**/__fixtures__/**"
       ]
DEBUG: No vulnerability alerts found (repository=huisam/Renovate-kotlin)
DEBUG: No vulnerability alerts found (repository=huisam/Renovate-kotlin)
DEBUG: findIssue(Dependency Dashboard) (repository=huisam/Renovate-kotlin)
DEBUG: Found issue 4 (repository=huisam/Renovate-kotlin)
DEBUG: No baseBranches (repository=huisam/Renovate-kotlin)
DEBUG: extract() (repository=huisam/Renovate-kotlin)
DEBUG: Setting current branch to main (repository=huisam/Renovate-kotlin)
DEBUG: latest commit (repository=huisam/Renovate-kotlin)
       "branchName": "main",
       "latestCommitDate": "2021-10-29T20:42:10+09:00"
DEBUG: Using file match: (^|/)tasks/[^/]+\.ya?ml$ for manager ansible (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)requirements\.ya?ml$ for manager ansible-galaxy (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)galaxy\.ya?ml$ for manager ansible-galaxy (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: azure.*pipelines?.*\.ya?ml$ for manager azure-pipelines (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)batect(-bundle)?\.yml$ for manager batect (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)batect$ for manager batect-wrapper (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)WORKSPACE(|\.bazel)$ for manager bazel (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: \.bzl$ for manager bazel (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)\.?bitbucket-pipelines\.ya?ml$ for manager bitbucket-pipelines (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: buildkite\.ya?ml for manager buildkite (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: \.buildkite/.+\.ya?ml$ for manager buildkite (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)Gemfile$ for manager bundler (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: \.cake$ for manager cake (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)Cargo.toml$ for manager cargo (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/).circleci/config.yml$ for manager circleci (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)cloudbuild.ya?ml for manager cloudbuild (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)Podfile$ for manager cocoapods (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)([\w-]*)composer.json$ for manager composer (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)deps\.edn$ for manager deps-edn (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)docker-compose[^/]*\.ya?ml$ for manager docker-compose (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/|\.)Dockerfile$ for manager dockerfile (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)Dockerfile\.[^/]*$ for manager dockerfile (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/).drone.yml$ for manager droneci (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/).gitmodules$ for manager git-submodules (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: ^(workflow-templates|\.github\/workflows)\/[^/]+\.ya?ml$ for manager github-actions (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|\/)action\.ya?ml$ for manager github-actions (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: \.gitlab-ci\.yml$ for manager gitlabci (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: \.gitlab-ci\.yml$ for manager gitlabci-include (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)go.mod$ for manager gomod (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: \.gradle(\.kts)?$ for manager gradle (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|\/)gradle\.properties$ for manager gradle (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|\/)gradle\/.+\.toml$ for manager gradle (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: \.versions\.toml$ for manager gradle (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)gradle/wrapper/gradle-wrapper.properties$ for manager gradle-wrapper (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)requirements\.yaml$ for manager helm-requirements (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)values.yaml$ for manager helm-values (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)helmfile.yaml$ for manager helmfile (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)Chart.yaml$ for manager helmv3 (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: ^Formula/[^/]+[.]rb$ for manager homebrew (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: \.html?$ for manager html (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)plugins\.(txt|ya?ml)$ for manager jenkins (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)kustomization\.yaml for manager kustomize (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)project\.clj$ for manager leiningen (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: \.pom\.xml$ for manager maven (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)pom\.xml$ for manager maven (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)package.js$ for manager meteor (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)mix\.exs$ for manager mix (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/).node-version$ for manager nodenv (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)package.json$ for manager npm (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: \.(?:cs|fs|vb)proj$ for manager nuget (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: \.(?:props|targets)$ for manager nuget (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: \.config\/dotnet-tools\.json$ for manager nuget (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|//)global\.json$ for manager nuget (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)\.nvmrc$ for manager nvm (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)([\w-]*)requirements\.(txt|pip)$ for manager pip_requirements (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)setup.py$ for manager pip_setup (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)Pipfile$ for manager pipenv (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)pyproject\.toml$ for manager poetry (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)\.pre-commit-config\.yaml$ for manager pre-commit (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)pubspec\.ya?ml$ for manager pub (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/).python-version$ for manager pyenv (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)\.ruby-version$ for manager ruby-version (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: \.sbt$ for manager sbt (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: project/[^/]*.scala$ for manager sbt (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)setup\.cfg$ for manager setup-cfg (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)Package\.swift for manager swift (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: \.tf$ for manager terraform (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)\.terraform-version$ for manager terraform-version (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)terragrunt\.hcl$ for manager terragrunt (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: (^|/)\.terragrunt-version$ for manager terragrunt-version (repository=huisam/Renovate-kotlin)
DEBUG: Using file match: ^.travis.yml$ for manager travis (repository=huisam/Renovate-kotlin)
DEBUG: Matched 4 file(s) for manager gradle: build.gradle.kts, buildSrc/build.gradle.kts, renovate-api/build.gradle.kts, settings.gradle.kts (repository=huisam/Renovate-kotlin)
DEBUG: Matched 1 file(s) for manager gradle-wrapper: gradle/wrapper/gradle-wrapper.properties (repository=huisam/Renovate-kotlin)
DEBUG: Found gradle package files (repository=huisam/Renovate-kotlin)
DEBUG: Found gradle-wrapper package files (repository=huisam/Renovate-kotlin)
DEBUG: Found 5 package file(s) (repository=huisam/Renovate-kotlin)
 INFO: Dependency extraction complete (repository=huisam/Renovate-kotlin)
       "baseBranch": "main",
       "stats": {
         "managers": {
           "gradle": {"fileCount": 4, "depCount": 1},
           "gradle-wrapper": {"fileCount": 1, "depCount": 1}
         },
         "total": {"fileCount": 5, "depCount": 2}
       }
DEBUG: Looking up io.spring.dependency-management:io.spring.dependency-management.gradle.plugin in repository https://repo.maven.apache.org/maven2/ (repository=huisam/Renovate-kotlin)
DEBUG: Content is not found for Maven url: https://repo.maven.apache.org/maven2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/maven-metadata.xml (repository=huisam/Renovate-kotlin)
DEBUG: Looking up io.spring.dependency-management:io.spring.dependency-management.gradle.plugin in repository https://plugins.gradle.org/m2/ (repository=huisam/Renovate-kotlin)
DEBUG: Found 29 new releases for io.spring.dependency-management:io.spring.dependency-management.gradle.plugin in repository https://plugins.gradle.org/m2/ (repository=huisam/Renovate-kotlin)
DEBUG: Package releases lookups complete (repository=huisam/Renovate-kotlin)
       "baseBranch": "main"
DEBUG: branchifyUpgrades (repository=huisam/Renovate-kotlin)
DEBUG: 0 flattened updates found:  (repository=huisam/Renovate-kotlin)
DEBUG: Returning 0 branch(es) (repository=huisam/Renovate-kotlin)
DEBUG: config.repoIsOnboarded=true (repository=huisam/Renovate-kotlin)
DEBUG: packageFiles with updates (repository=huisam/Renovate-kotlin)
       "config": {
         "gradle": [
           {
             "packageFile": "build.gradle.kts",
             "datasource": "maven",
             "deps": [
               {
                 "depType": "plugin",
                 "depName": "io.spring.dependency-management",
                 "lookupName": "io.spring.dependency-management:io.spring.dependency-management.gradle.plugin",
                 "registryUrls": [
                   "https://repo.maven.apache.org/maven2",
                   "https://plugins.gradle.org/m2/"
                 ],
                 "currentValue": "1.0.11.RELEASE",
                 "commitMessageTopic": "plugin io.spring.dependency-management",
                 "managerData": {
                   "fileReplacePosition": 208,
                   "packageFile": "build.gradle.kts"
                 },
                 "fileReplacePosition": 208,
                 "depIndex": 0,
                 "updates": [],
                 "warnings": [],
                 "versioning": "gradle",
                 "currentVersion": "1.0.11.RELEASE",
                 "fixedVersion": "1.0.11.RELEASE"
               }
             ]
           },
           {"packageFile": "settings.gradle.kts", "datasource": "maven", "deps": []},
           {
             "packageFile": "buildSrc/build.gradle.kts",
             "datasource": "maven",
             "deps": []
           },
           {
             "packageFile": "renovate-api/build.gradle.kts",
             "datasource": "maven",
             "deps": []
           }
         ],
         "gradle-wrapper": [
           {
             "packageFile": "gradle/wrapper/gradle-wrapper.properties",
             "deps": [
               {
                 "depName": "gradle",
                 "currentValue": "7.2",
                 "replaceString": "https\\://services.gradle.org/distributions/gradle-7.2-bin.zip",
                 "datasource": "gradle-version",
                 "versioning": "gradle",
                 "depIndex": 0,
                 "updates": [],
                 "warnings": [],
                 "sourceUrl": "https://github.com/gradle/gradle",
                 "homepage": "https://gradle.org",
                 "currentVersion": "7.2",
                 "fixedVersion": "7.2"
               }
             ]
           }
         ]
       }
DEBUG: processRepo() (repository=huisam/Renovate-kotlin)
DEBUG: Processing 0 branches:  (repository=huisam/Renovate-kotlin)
DEBUG: Calculating hourly PRs remaining (repository=huisam/Renovate-kotlin)
DEBUG: Retrieving PR list (repository=huisam/Renovate-kotlin)
DEBUG: Retrieved 1 Pull Requests (repository=huisam/Renovate-kotlin)
DEBUG: currentHourStart=2021-10-29T12:00:00.000+00:00 (repository=huisam/Renovate-kotlin)
DEBUG: PR hourly limit remaining: 2 (repository=huisam/Renovate-kotlin)
DEBUG: Calculating prConcurrentLimit (20) (repository=huisam/Renovate-kotlin)
DEBUG: 0 PRs are currently open (repository=huisam/Renovate-kotlin)
DEBUG: PR concurrent limit remaining: 20 (repository=huisam/Renovate-kotlin)
DEBUG: Calculated maximum PRs remaining this run (repository=huisam/Renovate-kotlin)
       "prsRemaining": 2
DEBUG: PullRequests limit = 2 (repository=huisam/Renovate-kotlin)
DEBUG: Calculating hourly PRs remaining (repository=huisam/Renovate-kotlin)
DEBUG: currentHourStart=2021-10-29T12:00:00.000+00:00 (repository=huisam/Renovate-kotlin)
DEBUG: PR hourly limit remaining: 2 (repository=huisam/Renovate-kotlin)
DEBUG: Calculating branchConcurrentLimit (20) (repository=huisam/Renovate-kotlin)
DEBUG: 0 already existing branches found:  (repository=huisam/Renovate-kotlin)
DEBUG: Branch concurrent limit remaining: 20 (repository=huisam/Renovate-kotlin)
DEBUG: Calculated maximum branches remaining this run (repository=huisam/Renovate-kotlin)
       "branchesRemaining": 2
DEBUG: Branches limit = 2 (repository=huisam/Renovate-kotlin)
DEBUG: Ensuring Dependency Dashboard (repository=huisam/Renovate-kotlin)
DEBUG: ensureIssue(Dependency Dashboard) (repository=huisam/Renovate-kotlin)
DEBUG: Issue is open and up to date - nothing to do (repository=huisam/Renovate-kotlin)
DEBUG: Removing any stale branches (repository=huisam/Renovate-kotlin)
DEBUG: config.repoIsOnboarded=true (repository=huisam/Renovate-kotlin)
DEBUG: No renovate branches found (repository=huisam/Renovate-kotlin)
DEBUG: Repository timing splits (milliseconds) (repository=huisam/Renovate-kotlin)
       "splits": {"init": 4137, "extract": 986, "lookup": 9311, "update": 364},
       "total": 15116
DEBUG: http statistics (repository=huisam/Renovate-kotlin)
       "urls": {
         "https://api.github.com/graphql (POST)": 3,
         "https://api.github.com/repos/huisam/Renovate-kotlin/issues/4 (GET)": 2,
         "https://api.github.com/repos/huisam/Renovate-kotlin/pulls (GET)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/0.2.1.RELEASE/io.spring.dependency-management.gradle.plugin-0.2.1.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/0.3.0.RELEASE/io.spring.dependency-management.gradle.plugin-0.3.0.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/0.3.1.RELEASE/io.spring.dependency-management.gradle.plugin-0.3.1.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/0.4.0.RELEASE/io.spring.dependency-management.gradle.plugin-0.4.0.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/0.4.1.RELEASE/io.spring.dependency-management.gradle.plugin-0.4.1.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/0.5.0.RELEASE/io.spring.dependency-management.gradle.plugin-0.5.0.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/0.5.1.RELEASE/io.spring.dependency-management.gradle.plugin-0.5.1.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/0.5.2.RELEASE/io.spring.dependency-management.gradle.plugin-0.5.2.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/0.5.3.RELEASE/io.spring.dependency-management.gradle.plugin-0.5.3.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/0.5.4.RELEASE/io.spring.dependency-management.gradle.plugin-0.5.4.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/0.5.5.RELEASE/io.spring.dependency-management.gradle.plugin-0.5.5.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/0.5.6.RELEASE/io.spring.dependency-management.gradle.plugin-0.5.6.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/0.5.7.RELEASE/io.spring.dependency-management.gradle.plugin-0.5.7.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/0.6.0.RELEASE/io.spring.dependency-management.gradle.plugin-0.6.0.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/0.6.1.RELEASE/io.spring.dependency-management.gradle.plugin-0.6.1.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/1.0.0.RC1/io.spring.dependency-management.gradle.plugin-1.0.0.RC1.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/1.0.0.RC2/io.spring.dependency-management.gradle.plugin-1.0.0.RC2.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/1.0.0.RELEASE/io.spring.dependency-management.gradle.plugin-1.0.0.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/1.0.1.RELEASE/io.spring.dependency-management.gradle.plugin-1.0.1.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/1.0.10.RELEASE/io.spring.dependency-management.gradle.plugin-1.0.10.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/1.0.11.RELEASE/io.spring.dependency-management.gradle.plugin-1.0.11.RELEASE.pom (GET)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/1.0.11.RELEASE/io.spring.dependency-management.gradle.plugin-1.0.11.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/1.0.2.RELEASE/io.spring.dependency-management.gradle.plugin-1.0.2.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/1.0.3.RELEASE/io.spring.dependency-management.gradle.plugin-1.0.3.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/1.0.4.RELEASE/io.spring.dependency-management.gradle.plugin-1.0.4.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/1.0.5.RELEASE/io.spring.dependency-management.gradle.plugin-1.0.5.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/1.0.6.RELEASE/io.spring.dependency-management.gradle.plugin-1.0.6.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/1.0.7.RELEASE/io.spring.dependency-management.gradle.plugin-1.0.7.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/1.0.8.RELEASE/io.spring.dependency-management.gradle.plugin-1.0.8.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/1.0.9.RELEASE/io.spring.dependency-management.gradle.plugin-1.0.9.RELEASE.pom (HEAD)": 1,
         "https://plugins.gradle.org/m2/io/spring/dependency-management/io.spring.dependency-management.gradle.plugin/maven-metadata.xml (GET)": 1,
         "https://services.gradle.org/versions/all (GET)": 1
       },
       "hostStats": {
         "api.github.com": {"requestCount": 6, "requestAvgMs": 364, "queueAvgMs": 0},
         "plugins.gradle.org": {
           "requestCount": 31,
           "requestAvgMs": 822,
           "queueAvgMs": 0
         },
         "services.gradle.org": {
           "requestCount": 1,
           "requestAvgMs": 53,
           "queueAvgMs": 1
         }
       },
       "totalRequests": 38
 INFO: Repository finished (repository=huisam/Renovate-kotlin)
       "durationMs": 15116
DEBUG: Renovate exiting
```

</div>
</details>


