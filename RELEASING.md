# Releasing the DLS and Playground app

The library is published to GitHub Packages using GitHub Actions, the workflow file for which can be
found [here](.github/workflows/release.yml).

1. Head over to the Github Actions tab, and select the workflow
   titled [Increase DLS library & playground version](../../actions/workflows/increase_version.yml)
   from the sidebar.
2. Use the "Run workflow" button to run it against `main` branch & pass the new release version
   parameter. For example, new release version can be `0.4.0`. Once the workflow is completed,
   github bot will raise a pull request to update the `CHANGELOG.md`, DLS lib version
   in `gradle.properties`, and playground app's `versionCode`
3. Review & merge the pull request raised in Step 1.
4. Head over to the Github Actions tab on GitHub and select the workflow titled
   [Release library and playground app](../../actions/workflows/release.yml)
   from the sidebar.
5. Use the "Run workflow" button to run the action against `main`. Pass the new release version
   passed in Step 1 & hash of the latest commit in main branch.
6. When the CI job has finished successfully, go to
   the [Firebase console](TODO: Create a firebase project and add the link here).
7. Select the unreleased version on the list, and add the appropriate user group to the
   release.
8. Copy the changelog for the version from `CHANGELOG.md` into the release notes dialog
9. Click publish
10. Announce the release in the appropriate Slack channels