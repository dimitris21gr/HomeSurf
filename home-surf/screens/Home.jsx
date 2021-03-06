import React from 'react';
import { Text, View } from 'react-native';
import { Button } from 'react-native-elements';

import globalStyles from '../global.scss';
import styles from './Home.module.scss';

export default function Home({ navigation }) {
  return (
    <View style={styles.container}>
      <Text style={styles.header}>HomeSurf</Text>
      <Button
        type="clear"
        titleStyle={globalStyles['button-title']}
        title="Sign in"
        onPress={() => navigation.navigate('SignIn')}
      />
    </View>
  );
}
