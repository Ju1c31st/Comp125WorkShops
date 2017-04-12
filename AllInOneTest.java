import static org.junit.Assert.*;

import org.junit.Test;

public class AllInOneTest {
	/********************************
	 *          Question 1          *
	 ********************************/
	@Test
	public void testGetUnitPrice() {
		StockItem item = new StockItem();
		assertEquals(0.1, item.getUnitPrice(), 0.001);
		item = new StockItem(0.5, 2);
		assertEquals(0.5, item.getUnitPrice(), 0.001);
		item = new StockItem(-0.5, 2);
		assertEquals(0, item.getUnitPrice(), 0.001);
	}

	@Test
	public void testGetQuantity() {
		StockItem item = new StockItem();
		assertEquals(1, item.getQuantity());
		item = new StockItem(0.5, 2);
		assertEquals(2, item.getQuantity());
		item = new StockItem(0.5, -2);
		assertEquals(0, item.getQuantity());
	}

	@Test
	public void testSetUnitPrice() {
		StockItem item = new StockItem();
		item.setUnitPrice(0.8);
		assertEquals(0.8, item.getUnitPrice(), 0.001);
		item.setUnitPrice(-0.8);
		assertEquals(0, item.getUnitPrice(), 0.001);
	}

	@Test
	public void testSetQuantity() {
		StockItem item = new StockItem();
		item.setQuantity(2);
		assertEquals(2, item.getQuantity());
		item.setQuantity(-2);
		assertEquals(0, item.getQuantity());
	}

	@Test
	public void testStockItem() {
		StockItem item = new StockItem();
		assertEquals(0.1, item.getUnitPrice(), 0.001);
		assertEquals(1, item.getQuantity());
	}

	@Test
	public void testStockItemDoubleInt() {
		StockItem item = new StockItem(0.6, 5);
		assertEquals(0.6, item.getUnitPrice(), 0.001);
		assertEquals(5, item.getQuantity());
		item = new StockItem(-0.6, -5);
		assertEquals(0, item.getUnitPrice(), 0.001);
		assertEquals(0, item.getQuantity());
	}

	@Test
	public void testTotalPrice() {
		StockItem item = new StockItem(0.6, 4);
		assertEquals(2.4, item.totalPrice(), 0.001);
		item = new StockItem(0.6, 6);
		assertEquals(3.6, item.totalPrice(), 0.001);
	}

	@Test
	public void testCompareTo() {
		StockItem item1 = new StockItem(0.6, 4);
		StockItem item2 = new StockItem(0.3, 4);
		StockItem item3 = new StockItem(0.9, 4);
		StockItem item4 = new StockItem(0.6, 4);
		assertEquals(1, item1.compareTo(item2));
		assertEquals(-1, item1.compareTo(item3));
		assertEquals(0, item1.compareTo(item4));
	}

	/********************************
	 *    Question 2 and beyond     *
	 ********************************/
	@Test
	public void testProduct() {
		//null array check
		assertEquals(1, AllInOne.product(null));

		//empty array check
		int[] empty = new int[0];
		assertEquals(1, AllInOne.product(empty));

		int[] a = {1,2,3,4};
		assertEquals(24, AllInOne.product(a));
		a[0] = 5;
		assertEquals(120, AllInOne.product(a));
		a[3] = 1;
		assertEquals(30, AllInOne.product(a));
	}

	@Test
	public void testAllInRange() {
		//null array check
		assertFalse(AllInOne.allInRange(null, 1, 5));

		//empty array check
		int[] empty = new int[0];
		assertFalse(AllInOne.allInRange(empty, 1, 5));

		int[] a = {1,2,3,4};
		assertTrue(AllInOne.allInRange(a, 1, 4));
		assertTrue(AllInOne.allInRange(a, 0, 6));
		assertFalse(AllInOne.allInRange(a, 1, 3));
		assertFalse(AllInOne.allInRange(a, 2, 4));
		assertFalse(AllInOne.allInRange(a, 2, 3));
		a[3] = 3;
		assertTrue(AllInOne.allInRange(a, 1, 4));
		assertTrue(AllInOne.allInRange(a, 0, 6));
		assertTrue(AllInOne.allInRange(a, 1, 3));
		assertFalse(AllInOne.allInRange(a, 2, 4));
		assertFalse(AllInOne.allInRange(a, 2, 3));
		a[0] = 2;
		assertTrue(AllInOne.allInRange(a, 1, 4));
		assertTrue(AllInOne.allInRange(a, 0, 6));
		assertTrue(AllInOne.allInRange(a, 1, 3));
		assertTrue(AllInOne.allInRange(a, 2, 4));
		assertTrue(AllInOne.allInRange(a, 2, 3));

	}

	@Test
	public void testBinarySearch() {
		int[] a = {1,2,3,4,5,6,7,8};
		for(int i=0; i < a.length; i++) {
			assertEquals(i, AllInOne.binarySearch(a, a[i]));
		}
		assertEquals(-1, AllInOne.binarySearch(a, 0));
		assertEquals(-1, AllInOne.binarySearch(a, 9));
	}

	@Test
	public void testSelectionSort() {
		int[] a = {5,4,3,2,1,0};
		AllInOne.selectionSort(a);
		for(int i=0; i < a.length; i++)
			assertEquals(i, a[i]); //a[0] should be 0, a[1] should be 1, ...
		
		int[] b = {8,6,4,2,0};
		AllInOne.selectionSort(b);
		for(int i=0; i < b.length; i++)
			assertEquals(2*i, b[i]); //b[0] should be 0, b[1] should be 2, ...
	}

	@Test
	public void testGetItemsInRange() {
		int[] a = {1,7,1,2,3,6,2,4,8,3,1};
		int[] b = AllInOne.getItemsInRange(a, 3, 5);
		//b should be {3,4,3}
		assertEquals(3, b.length);
		assertEquals(3, b[0]);
		assertEquals(4, b[1]);
		assertEquals(3, b[2]);
		
		int[] c = AllInOne.getItemsInRange(a, 1, 5);
		//b should be {1,1,2,3,2,4,3,1}
		assertEquals(8, c.length);
		assertEquals(1, c[0]);
		assertEquals(1, c[1]);
		assertEquals(2, c[2]);
		assertEquals(3, c[3]);
		assertEquals(2, c[4]);
		assertEquals(4, c[5]);
		assertEquals(3, c[6]);
		assertEquals(1, c[7]);
	}

}
