package com.google.gwt.maps.client.layers;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class KmlLayerMetadataTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testAuthor() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				KmlLayerMetadata o = KmlLayerMetadata.newInstance();
				KmlAuthor left = KmlAuthor.newInstance();
				left.setEmail("test123");
				o.setAuthor(left);
				KmlAuthor right = o.getAuthor();
				assertEquals(left.getEmail(), right.getEmail());
				finishTest();
			}
		});

	}

	public void testDescription() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				KmlLayerMetadata o = KmlLayerMetadata.newInstance();
				String left = "test123";
				o.setDescription(left);
				String right = o.getDescription();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testName() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				KmlLayerMetadata o = KmlLayerMetadata.newInstance();
				String left = "test123";
				o.setName(left);
				String right = o.getName();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testSnippet() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				KmlLayerMetadata o = KmlLayerMetadata.newInstance();
				String left = "test123";
				o.setSnippet(left);
				String right = o.getSnippet();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				KmlLayerMetadata o = KmlLayerMetadata.newInstance();
				finishTest();
			}
		});

	}

}
