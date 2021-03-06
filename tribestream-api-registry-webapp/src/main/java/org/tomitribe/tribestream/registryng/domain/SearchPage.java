/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tomitribe.tribestream.registryng.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.tribestream.registryng.domain.search.SearchResult;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchPage {
    private List<SearchResult> results;
    private int total;
    private int current;

    private Collection<CloudItem> applications;
    private Collection<CloudItem> categories;
    private Collection<CloudItem> tags;
    private Collection<CloudItem> roles;

    public static SearchPage empty() {
        final SearchPage searchPage = new SearchPage();
        searchPage.setResults(new ArrayList<>());
        searchPage.setTotal(0);
        searchPage.setCurrent(0);
        searchPage.setApplications(new ArrayList<>());
        searchPage.setCategories(new ArrayList<>());
        searchPage.setTags(new ArrayList<>());
        searchPage.setRoles(new ArrayList<>());
        return searchPage;
    }
}
