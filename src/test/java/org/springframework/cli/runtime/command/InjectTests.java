/*
 * Copyright 2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cli.runtime.command;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class InjectTests extends AbstractCommandTests {

	@Test
	void injectBefore() throws IOException {
		Map<String, Object> model = new HashMap<>();
		runInjectAction("before", "text", model, "myfile-before",
				"src/test/resources/org/springframework/cli/runtime/command/inject");
	}

	@Test
	void injectAfter() throws IOException {
		Map<String, Object> model = new HashMap<>();
		runInjectAction("after", "text", model, "myfile-after",
				"src/test/resources/org/springframework/cli/runtime/command/inject");
	}

}
