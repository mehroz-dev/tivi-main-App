// Copyright 2023, Christopher Banes and the Tivi project contributors
// SPDX-License-Identifier: Apache-2.0


plugins {
  id("app.tivi.kotlin.multiplatform")
}

kotlin {
  sourceSets {
    commonMain {
      dependencies {
        api(projects.core.preferences)
        api(projects.data.models)
        api(projects.data.traktauth)
        implementation(projects.data.db)
        implementation(projects.data.legacy) // remove this eventually

        api(projects.api.trakt)
        api(projects.api.tmdb)

        implementation(libs.kotlininject.runtime)
      }
    }
  }
}
