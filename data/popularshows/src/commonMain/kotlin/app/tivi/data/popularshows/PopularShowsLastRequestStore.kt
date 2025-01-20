// Copyright 2023, Google LLC, Christopher Banes and the Tivi project contributors
// SPDX-License-Identifier: Apache-2.0

package app.tivi.data.popularshows

import app.tivi.data.daos.LastRequestDao
import app.tivi.data.lastrequests.GroupLastRequestStore
import app.tivi.data.models.Request
import me.tatarka.inject.annotations.Inject

@Inject
class PopularShowsLastRequestStore(
  dao: LastRequestDao,
) : GroupLastRequestStore(Request.POPULAR_SHOWS, dao)
