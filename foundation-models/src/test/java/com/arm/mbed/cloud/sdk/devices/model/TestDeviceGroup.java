// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeviceGroup.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceGroup {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceGroup devicegroup1 = new DeviceGroup(new Date(1559746952155L), null,
                                                       "188f07e8-79db-4b53-845c-c7ae6d64307e", -120,
                                                       "5169a23c-0557-4911-b499-623997671b8f",
                                                       "469bcbf6-6d09-4564-aab7-090afb9ba7ef",
                                                       new Date(1559746948717L));
            DeviceGroup devicegroup2 = devicegroup1.clone();
            assertNotNull(devicegroup1);
            assertNotNull(devicegroup2);
            assertNotSame(devicegroup2, devicegroup1);
            assertEquals(devicegroup2, devicegroup1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the hashCode method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testHashCode() {
        try {
            DeviceGroup devicegroup1 = new DeviceGroup(new Date(1559746954486L), null,
                                                       "af1e9428-2a34-4580-a38f-3337cb8b6c2c", -109,
                                                       "48a86612-2e66-4ddd-91fc-3c75f479ffc9",
                                                       "d83ec31b-e5c8-4fcc-968e-e093db671837",
                                                       new Date(1559746951144L));
            DeviceGroup devicegroup2 = new DeviceGroup(new Date(1559746954486L), null,
                                                       "af1e9428-2a34-4580-a38f-3337cb8b6c2c", -109,
                                                       "48a86612-2e66-4ddd-91fc-3c75f479ffc9",
                                                       "d83ec31b-e5c8-4fcc-968e-e093db671837",
                                                       new Date(1559746951144L));
            assertNotNull(devicegroup1);
            assertNotNull(devicegroup2);
            assertNotSame(devicegroup2, devicegroup1);
            assertEquals(devicegroup2, devicegroup1);
            assertEquals(devicegroup2.hashCode(), devicegroup1.hashCode());
            int hashCode = devicegroup1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, devicegroup1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the isValid method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testIsValid() {
        DeviceGroup devicegroup = new DeviceGroup(new Date(1559746950743L), null,
                                                  "d7809d22-9ac3-4157-ab87-fc224dc68577", -77,
                                                  "36e7ec58-d040-4ba5-9e8c-78554b0feecf",
                                                  "fb2ae96a-e24d-4372-9136-024a87a5daaa", new Date(1559746953491L));
        assertTrue(devicegroup.isValid());
        DeviceGroup devicegroupInvalid = new DeviceGroup(new Date(1559746953093L), null,
                                                         "9d543004-4ae1-4651-a21a-40c2e6524567ba4b20cc-b674-4cce-aafa-a260072de76e4765bf1c-b35b-4692-b207-b0915646a43ff0d1ac18-2ed6-45cd-b05e-0b9e5d26f87827c7730a-ede1-4642-9e10-938809f08f81bb6e7681-c895-43c4-a6c5-a2698ee01b24fccefcc6-ec47-4710-ace8-aeff76ef7415a9ff998c-a2f0-4084-ba90-57a86edd0bf5f370deec-c6db-45ec-8e91-0000fb915f02c7c7e7ed-061b-412b-b6fc-01426c96d14b1ad74411-4b00-4680-b9f7-b3ecd0d740d20f0d50ce-2e62-4dc8-b1f5-b1e6a7d0787a28a466eb-9c16-478d-837a-bbc82d357824ed954634-a396-4f82-b07f-5247966517c1e4bc4086-46b6-407f-8e72-38bf2fafcca436840619-deff-42ef-a2a2-2b435e50dc713e13864b-c7aa-4d80-b75f-af3328a672ac805d8d48-1fcf-43e2-a721-8853d5ca0de9a45a77c7-4c3e-4b23-85b5-e5cbd12c3eccd47ec416-853d-45ca-80ae-750a6ecb2165714f4dcf-bf14-41b7-bd04-60760bccb657971bae3c-a95c-4ba5-a9d0-25bbb22f6734c96f74bf-3e3f-4896-9ef7-624424147989c4d8fc20-57e3-4791-8f9b-b4f5350ff1491c0e6e6a-c7c0-4eff-b607-267e6e46f51eeda797d2-3582-42b6-9121-3bf513fc6f766cad0495-83f0-46cd-82e5-e95db2c7febcf82ffc22-0ae8-4883-a706-60ffec102bfee7fb0648-3ae7-4a38-b32b-cde15a9ce9bbdcefd390-4473-4769-9a81-01fbc8dcfe5161fc7397-db14-4262-9530-26829f7fbad3d9789304-126f-4be3-a62a-d4e1ebbe08417686fc55-2798-481a-b4f6-c6edd1adb3024e27a952-fc51-499f-865e-203f76e3e1c925713b4b-33ce-44ed-8307-69970c5763764e77c58e-5060-4601-8154-ad45f88fc975d2ecfd70-ef1d-4b61-a563-867c07bea22013a76f59-e384-4dca-891a-0e4a1e5313f0b48e3b4e-4604-458f-99a1-7cfb534676c9e2f9009f-239d-4566-a75b-4b5223201f4bb9ad1f7b-941d-4d88-bb70-40ddf4293b5500ab1a9c-da6c-413b-85f5-f3a28cae87d8e48bcdb7-2feb-4315-975e-5954ff8b31f372b65af4-96b0-439b-8d6a-f2e83e3db74bde490c2a-6b3e-435b-98ec-0dca2bf7ce6252585a33-7042-41a1-bc3a-e6dd25f7791fe35d704a-5319-4e71-9a5b-a81bea4907822c081615-9d59-4a80-a956-2d0ab2f3c876a0de3aa5-4123-48a1-99ce-5380fae8f83a59b95620-36ab-4797-b27b-29ff0d97e8bc5a6ac2e7-408d-4808-8279-cc74427fef9c0f77e792-cedc-45b2-aa39-4c8b77f91a5abd3f8d66-537d-4365-980a-683159f40cd5ab5d0f45-cf79-4ca5-8e25-1d55a82e04dd56807d2d-04bf-434f-b60d-c151fc021714b1d04075-fd3e-497c-822b-59cc85549aec",
                                                         36, "431e44cb-345f-4067-bd1f-15aa3990e007",
                                                         "db58118c-209a-431f-a17a-3b5e5c3259f38fa7d6d0-30df-4b58-8fee-3bc2a4285dea8ec24822-6408-4a6c-8d9d-02fa9421c7f3f270a279-6851-4168-9d39-8eabf9045071",
                                                         new Date(1559746946688L));
        assertFalse(devicegroupInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceGroup devicegroup1 = new DeviceGroup(new Date(1559746952142L), null,
                                                       "1cd3fc17-631f-43c9-b9f6-fef66d265b9c", 95,
                                                       "3d411a58-2ca2-43db-bbf7-f41825d63432",
                                                       "aee72974-b987-47b8-93d0-459a0cf236f4",
                                                       new Date(1559746952157L));
            DeviceGroup devicegroup2 = new DeviceGroup(new Date(1559746952142L), null,
                                                       "1cd3fc17-631f-43c9-b9f6-fef66d265b9c", 95,
                                                       "3d411a58-2ca2-43db-bbf7-f41825d63432",
                                                       "aee72974-b987-47b8-93d0-459a0cf236f4",
                                                       new Date(1559746952157L));
            DeviceGroup devicegroup3 = new DeviceGroup(new Date(1559746949308L), null,
                                                       "48016b52-ab4f-492d-92b1-cdc835082926", -2,
                                                       "14f7f112-87f9-4648-bdb4-3cadf084161c",
                                                       "fec18558-9c8d-4c0e-9e66-a20e42d112ce",
                                                       new Date(1559746950997L));
            assertNotNull(devicegroup1);
            assertNotNull(devicegroup2);
            assertNotNull(devicegroup3);
            assertNotSame(devicegroup2, devicegroup1);
            assertNotSame(devicegroup3, devicegroup1);
            assertEquals(devicegroup2, devicegroup1);
            assertEquals(devicegroup2, devicegroup1);
            assertEquals(devicegroup1, devicegroup2);
            assertEquals(devicegroup1, devicegroup1);
            assertFalse(devicegroup1.equals(null));
            assertNotEquals(devicegroup3, devicegroup1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
