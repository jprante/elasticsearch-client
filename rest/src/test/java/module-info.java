/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

module org.xbib.elasticsearch.client.rest.test {

    exports org.elasticsearch.client.rest.test;

    requires jdk.httpserver;
    requires junit;
    requires hamcrest.all;
    requires httpcore;
    requires httpcore.nio;
    requires httpclient;
    requires httpasyncclient;
    requires org.xbib.elasticsearch.client.resttest;
    requires org.xbib.elasticsearch.client.rest;
    requires org.xbib.elasticsearch.securemock;
    requires org.xbib.elasticsearch.mocksocket;
    requires org.xbib.elasticsearch.randomizedtesting;
}