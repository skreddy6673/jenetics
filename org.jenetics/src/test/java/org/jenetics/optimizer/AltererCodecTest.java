/*
 * Java Genetic Algorithm Library (@__identifier__@).
 * Copyright (c) @__year__@ Franz Wilhelmstötter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author:
 *    Franz Wilhelmstötter (franz.wilhelmstoetter@gmx.at)
 */
package org.jenetics.optimizer;

import org.testng.annotations.Test;

import org.jenetics.Alterer;
import org.jenetics.DoubleGene;
import org.jenetics.Genotype;
import org.jenetics.Selector;
import org.jenetics.engine.Codec;

/**
 * @author <a href="mailto:franz.wilhelmstoetter@gmx.at">Franz Wilhelmstötter</a>
 */
public class AltererCodecTest {

	@Test
	public void general() {
		final Codec<Alterer<DoubleGene, Double>, DoubleGene> codec =
			AltererCodec.general();

		final Genotype<DoubleGene> gt = codec.encoding().newInstance();
		codec.decoder().apply(gt);
	}

	@Test
	public void numeric() {
		final Codec<Alterer<DoubleGene, Double>, DoubleGene> codec =
			AltererCodec.numeric();

		final Genotype<DoubleGene> gt = codec.encoding().newInstance();
		codec.decoder().apply(gt);
	}

}
