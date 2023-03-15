@file:Suppress("UnstableApiUsage")

package com.example.testsupernova.lint

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.client.api.Vendor
import com.android.tools.lint.detector.api.Issue

class DLSIssueRegistry : IssueRegistry() {

  override val vendor = Vendor(vendorName = "TestSuperNova", feedbackUrl = "")

  override val issues: List<Issue>
    get() = listOf()
}