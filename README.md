# Renovate-kotlin
renovate reproduction for test

## Expected

I want to generate the pull request based by our repository structure.  
It worked before, but it doesn't work at some point.

## Happen

There is no pull Request for renovate bot.
But Dashboard(Issue) update well.

## Reproduction Progress

1. Generate the repository based by caused problem on the repository.
2. Self hosting with docker below this configuration.
```json
module.exports = {
  token: 'mytoken',
  platform: 'github',
  logLevel: 'debug',
  onboardingConfig: {
    extends: ['config:base'],
  },
  repositories: ['Oragnization/Repository'],
  hostRules: [
    {
      "domainName": "github.com",
      "token": "mytoken",
      "concurrentRequestLimit": 20
    }
  ],
  "gradle": {
    "enabled": true
  },
  deepExtract: true
};
```
3. run self hosting
