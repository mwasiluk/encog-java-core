/*
 * Encog(tm) Core v3.3 - Java Version
 * http://www.heatonresearch.com/encog/
 * https://github.com/encog/encog-java-core
 
 * Copyright 2008-2014 Heaton Research, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *   
 * For more information on Heaton Research copyrights, licenses 
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package org.encog.neural.activation;

import junit.framework.TestCase;

import org.encog.engine.network.activation.ActivationSoftMax;
import org.junit.Assert;
import org.junit.Test;

public class TestActivationSoftMax extends TestCase {

	@Test
	public void testSoftMax() throws Throwable
	{
		ActivationSoftMax activation = new ActivationSoftMax();
		Assert.assertTrue(activation.hasDerivative());
		
		ActivationSoftMax clone = (ActivationSoftMax)activation.clone();
		Assert.assertNotNull(clone);
		
		double[] input = {1.0,1.0,1.0,1.0 };
		
		activation.activationFunction(input,0,input.length);
		
		Assert.assertEquals(0.25,input[0],0.1);
		Assert.assertEquals(0.25,input[1],0.1);
		
		// test derivative
		input[0] = activation.derivativeFunction(input[0],input[0]);
		
	}
	
}
