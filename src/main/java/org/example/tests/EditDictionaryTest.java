package org.example.tests;

@Ui
@Service("dictionary-service-2")
@Entity("dictionary")
@DisplayName("Карточка Справочника")
@Action("Редактирование Справочника")
@Smoke
@Product
@Core
@Feature("Сервисы")
public class EditDictionaryTest {

    static User admin = TestDataManager.getAdmin();
    static DictionaryModelToUiMapper mapper;
    static ManagerDictionaries managerDictionaries;
    static DictionaryEntity dictionary;

    @BeforeAll
    static void setUp() {
        managerDictionaries = new ManagerDictionaries();
        mapper = new DictionaryModelToUiMapper();
        dictionary = managerDictionaries.createDictionary();
        uiBoard = mapper.toUiBoard(generateDictionaryForEdit(dictionary, false));
    }

    @Test
    @AllureId("")
    @DisplayName("Редактирование карточки справочника")
    @Description("Позитив")
    @Priority("High")
    @Owner("")
    void editDictionaryPageTest() {
        openPage(admin, DictionaryPage.class, String.valueOf(dictionary.getId()))
                .checkHeaderName(dictionary.getName())
                .getBoard()
                .fillBoard(uiBoard)
                .clickButtonByName("Сохранить")
                .getBoard()
                .checkBoard(uiBoard);
        step("Проверяем, что справочник отредактирован в БД",
                () -> assertThat(uiBoard)
                        .usingRecursiveComparison()
                        .ignoringFields("updatedAt")
                        .as("Справочник не совпадает с БД")
                        .isEqualTo(mapper.toUiBoard(managerDictionaries.getDictionaryById(dictionary.getId()))));
    }

    @AfterAll
    static void tearDown() {
        managerDictionaries.deleteDictionaryById(dictionary.getId());
    }
}
